CREATE TABLE hibernate_sequence
(
    next_val BIGINT NULL
);
INSERT INTO hibernate_sequence (next_val) VALUES (1);

CREATE TABLE game
(
    id              BIGINT PRIMARY KEY,
    red_score       SMALLINT      NOT NULL,
    blue_score      SMALLINT      NOT NULL,
    red_possession  DECIMAL(5, 2) NOT NULL,
    blue_possession DECIMAL(5, 2) NOT NULL,
    winning_team    VARCHAR(4)    NOT NULL
);

CREATE TABLE player
(
    auth VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE goal
(
    id            BIGINT PRIMARY KEY,
    game_id       BIGINT      NOT NULL,
    scoring_team  VARCHAR(4)  NOT NULL,
    scorer_auth   VARCHAR(50) NOT NULL,
    assister_auth VARCHAR(50) NULL,
    own_goal      BOOLEAN     NOT NULL,
    CONSTRAINT fk_game_goals_game_id FOREIGN KEY (game_id) REFERENCES game (id),
    CONSTRAINT fk_game_goals_scorer_auth FOREIGN KEY (scorer_auth) REFERENCES player (auth),
    CONSTRAINT fk_game_goals_assister_auth FOREIGN KEY (assister_auth) REFERENCES player (auth)
);

CREATE TABLE player_stat
(
    id            BIGINT PRIMARY KEY,
    game_id       BIGINT        NOT NULL,
    player_auth   VARCHAR(50)   NOT NULL,
    team          VARCHAR(4)    NOT NULL,
    possession    DECIMAL(5, 2) NOT NULL,
    shots_on_goal SMALLINT      NOT NULL,
    goals         SMALLINT      NOT NULL,
    assists       SMALLINT      NOT NULL,
    own_goals     SMALLINT      NOT NULL,
    win           SMALLINT      NOT NULL,
    loss          SMALLINT      NOT NULL,
    CONSTRAINT fk_player_stats_game_id FOREIGN KEY (game_id) REFERENCES game (id),
    CONSTRAINT fk_player_stats_player_auth FOREIGN KEY (player_auth) REFERENCES player (auth),
    CONSTRAINT uq_player_stats_game_id_player_auth UNIQUE (game_id, player_auth)
)

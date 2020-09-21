CREATE TABLE MATCH (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    player1_id BIGINT NOT NULL,
    player2_id VARCHAR(100) NOT NULL,
    score varchar(20) NOT NULL,
    date timestamp DEFAULT current_timestamp
);

CREATE TABLE PLAYER (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

ALTER TABLE MATCH
    ADD CONSTRAINT match_player1_id
    FOREIGN KEY (player1_id) REFERENCES player(id);

ALTER TABLE MATCH
    ADD CONSTRAINT match_player2_id
    FOREIGN KEY (player2_id) REFERENCES player(id);
CREATE TABLE USER(
    ID NUMBER(10) PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(50) NOT NULL,
    PASSWORD VARCHAR(50) NOT NULL
);

CREATE TABLE BOOKS (
    ID NUMBER(10) PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(50),
    USER_ID NUMBER(10),
    FOREIGN KEY (USER_ID) REFERENCES USERS (ID)
)

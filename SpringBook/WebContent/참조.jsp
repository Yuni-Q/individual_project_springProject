CREATE DATABASE SPRING;
USE SPRING
CREATE TABLE MEMBER(
	MEMBER_ID VARCHAR(20) PRIMARY KEY,
	MEMBER_PW VARCHAR(20) NOT NULL,
	PHONE VARCHAR(14) NOT NULL,
	EMAIL VARCHAR(50)
	)
	default character set utf8 collate utf8_general_ci ;


USE SPRING

CREATE TABLE BOARD(
	ARTICLE_NUM INT PRIMARY KEY AUTO_INCREMENT,
	TITLE VARCHAR(100) NOT NULL DEFAULT 'NO TITLE',
	WRITER VARCHAR(50) NOT NULL,
	CONTENT TEXT,
	READ_COUNT INT NOT NULL,
	WRITE_DATE DATETIME NOT NULL, 
	AUTHOR VARCHAR(50),
	PUBLISHER VARCHAR(50),
	PUBDATE VARCHAR(50),
	IMAGE VARCHAR(200),
	FOREIGN KEY(WRITER) REFERENCES MEMBER(MEMBER_ID)
	)
	default character set utf8 collate utf8_general_ci ;

ALTER TABLE table_name convert to charset utf8;

이후 Database 생성 시 utf8로 캐릭터셋 지정

create database test DEFAULT CHARACTER SET utf8 collate utf8_general_ci;


TABLE 생성 시 utf8로 캐릭터셋 지정

create table test(...........) default character set utf8 collate utf8_general_ci ;


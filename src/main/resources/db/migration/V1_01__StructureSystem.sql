DROP TABLE IF EXISTS PUBLIC."sampletable";
CREATE TABLE "sampletable"
(
	"id"						SERIAL PRIMARY KEY,
	"last_name"					VARCHAR(64),
	"first_name"				VARCHAR(64)	
);
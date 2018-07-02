DROP TABLE IF EXISTS PUBLIC."account";
CREATE TABLE "account"
(
	"id"						SERIAL PRIMARY KEY,
	"last_name"					VARCHAR(64),
	"first_name"				VARCHAR(64)	
);
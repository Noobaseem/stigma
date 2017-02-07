CREATE TABLE users (
	id BIGSERIAL PRIMARY KEY,
	user_name VARCHAR(50) NOT NULL,
	password VARCHAR(255),
	first_name VARCHAR(100), 
	last_name VARCHAR(100),
	email VARCHAR(100), 
	enabled INTEGER,
	last_password_reset_date TIMESTAMP
);

CREATE TABLE authority (
	id BIGSERIAL PRIMARY KEY,
	name VARCHAR(50)
);

CREATE TABLE user_authority (
	user_id INT REFERENCES users(id),
	authority_id INT REFERENCES authority(id)
);
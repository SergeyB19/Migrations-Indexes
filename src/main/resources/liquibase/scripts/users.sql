-- liquibase formatted sql

--changeset firstname, middlename:1
CREATE TABLE users(
    id SERIAL,
    email TEXT
)

-- changeset firstname, middlename:2
ALTER TABLE users
    ADD COLUMN name TEXT;

-- changeset firstname, middlename:3
CREATE INDEX users_name_index ON users (name);


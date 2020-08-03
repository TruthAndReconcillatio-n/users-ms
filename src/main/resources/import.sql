INSERT INTO users (username ,password, enabled, name, surname, email) VALUES('andre','12345',1,'andre','vittorio','rexeux@mail.fr');
INSERT INTO users (username ,password, enabled, name, surname, email) VALUES('admin','12345',1,'administrador','boxnotrix','root@mail.fr');

INSERT INTO roles (name) VALUES('ROLE_USER');
INSERT INTO roles (name) VALUES('ROLE_ADMIN');

INSERT INTO users_roles (users_id, roles_id) VALUES (1,1);
INSERT INTO users_roles (users_id, roles_id) VALUES (2,2);
INSERT INTO users_roles (users_id, roles_id) VALUES (2,1);
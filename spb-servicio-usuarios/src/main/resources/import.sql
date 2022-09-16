-- # MYSQL
-- INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('rolo', '12345', 1, 'Rolando', 'Ramos','rolando@triclick.co');
-- INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin', '54321', 1, 'John', 'Doe','jhon.doe@triclick.co');

-- INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
-- INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

-- INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
-- INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
-- INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

-- PostgreSQL
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('rolo', '12345', true, 'Rolando', 'Ramos','rolando@triclick.co');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '54321', true, 'John', 'Doe','jhon.doe@triclick.co');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);

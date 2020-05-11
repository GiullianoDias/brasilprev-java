-- Database: db_BRprev

-- DROP DATABASE "db_BRprev";

CREATE DATABASE "db_BRprev"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
-- -----------------------------------------------------
-- Table `produto`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS product (
                                       id SERIAL,
                                       name VARCHAR(85) NULL,
                                       description VARCHAR(350) NOT NULL,
                                       urlPicture VARCHAR(350) NOT NULL,
                                       value numeric(12, 2) NOT NULL,
                                       PRIMARY KEY (id))
;


-- -----------------------------------------------------
-- Table `cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS customer (
                                        id SERIAL,
                                        CPF INT NOT NULL,
                                        name VARCHAR(85) NOT NULL,
                                        address VARCHAR(250) NOT NULL,
                                        phone VARCHAR(45) NOT NULL,
                                        PRIMARY KEY (id))
;


-- -----------------------------------------------------
-- Table `pedido`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS orders (
                                      id SERIAL,
                                      orderDate DATE NOT NULL,
                                      id_customer INT NOT NULL,
                                      PRIMARY KEY (id),
                                      CONSTRAINT fk_pedidoCliente
                                          FOREIGN KEY (id_customer)
                                              REFERENCES customer (id)
                                              ON DELETE NO ACTION
                                              ON UPDATE NO ACTION
);


-- -----------------------------------------------------
-- Table `pedidoProdutos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS orderProducts (
                                             id_order INT NOT NULL,
                                             id_product INT NOT NULL
    ,
                                             CONSTRAINT fk_pedidoProdutos_Pedido
                                                 FOREIGN KEY (id_order)
                                                     REFERENCES orders (id)
                                                     ON DELETE NO ACTION
                                                     ON UPDATE NO ACTION,
                                             CONSTRAINT fk_pedidoProdutos_Produto
                                                 FOREIGN KEY (id_product)
                                                     REFERENCES product (id)
                                                     ON DELETE NO ACTION
                                                     ON UPDATE NO ACTION)
;

CREATE INDEX fk_pedidoProdutos_Pedido_idx ON orderProducts (id_order ASC);
CREATE INDEX fk_pedidoProdutos_Produto_idx ON orderProducts (id_product ASC);

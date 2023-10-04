CREATE TABLE `bdtienda`.`pedidos` (
  `idpedidos` INT NOT NULL AUTO_INCREMENT,
  `codigoproducto` VARCHAR(45) NULL,
  `unidades` INT NULL,
  `total` DOUBLE NULL,
  `fecha` DATETIME NULL,
  PRIMARY KEY (`idpedidos`));

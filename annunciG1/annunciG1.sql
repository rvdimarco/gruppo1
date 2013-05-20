CREATE SCHEMA `annunci` ;



CREATE  TABLE `annunci`.`utenti` (
  `id` INT(11) NOT NULL ,
  `username` VARCHAR(45) NULL ,
  `password` VARCHAR(45) NULL ,
  `nome` VARCHAR(45) NULL ,
  `cognome` VARCHAR(45) NULL ,
  `id_ruolo` INT(11) NULL ,
  `stato` INT(1) NULL ,
  `credito_residuo` INT(11) NULL ,
  PRIMARY KEY (`id`) );




CREATE  TABLE `annunci`.`ruoli` (
  `id` INT(11) NOT NULL ,
  `descrizione` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) );




CREATE  TABLE `annunci`.`annunci` (
  `id` INT(11) NOT NULL ,
  `descrizione` VARCHAR(45) NULL ,
  `data_inserimento` TIMESTAMP NULL DEFAULT now() ,
  `visite` INT(11) NULL ,
  `stato` INT(1) NULL ,
  `id_categoria` INT(11) NULL ,
  `id_prodotto` INT(11) NULL ,
  `owner` INT(11) NULL ,
  PRIMARY KEY (`id`) );




CREATE  TABLE `annunci`.`categorie` (
  `id` INT NOT NULL ,
  `descrizione` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) );




CREATE  TABLE `annunci`.`prodotti` (
  `id` INT(11) NOT NULL ,
  `descrizione` VARCHAR(45) NULL ,
  `prezzo` INT(11) NULL ,
  `data_acquisto` DATE NULL ,
  PRIMARY KEY (`id`) );




ALTER TABLE `annunci`.`annunci` 
  ADD CONSTRAINT `fk_utenti_annunci`
  FOREIGN KEY (`owner` )
  REFERENCES `annunci`.`utenti` (`id` )
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
, ADD INDEX `fk_utenti_annunci_idx` (`owner` ASC) ;




ALTER TABLE `annunci`.`utenti` 
  ADD CONSTRAINT `fk_ruoli`
  FOREIGN KEY (`id_ruolo` )
  REFERENCES `annunci`.`ruoli` (`id` )
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
, ADD INDEX `fk_ruoli_idx` (`id_ruolo` ASC) ;




ALTER TABLE `annunci`.`annunci` 
  ADD CONSTRAINT `fk_categoria`
  FOREIGN KEY (`id_categoria` )
  REFERENCES `annunci`.`categorie` (`id` )
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
, ADD INDEX `fk_categoria_idx` (`id_categoria` ASC) ;




ALTER TABLE `annunci`.`annunci` 
  ADD CONSTRAINT `fk_prodotti`
  FOREIGN KEY (`id_prodotto` )
  REFERENCES `annunci`.`prodotti` (`id` )
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
, ADD INDEX `fk_prodotti_idx` (`id_prodotto` ASC) ;

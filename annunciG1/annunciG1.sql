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



INSERT INTO `annunci`.`ruoli` (`id`, `descrizione`) VALUES ('1', 'Amministratore');
INSERT INTO `annunci`.`ruoli` (`id`, `descrizione`) VALUES ('2', 'Standard');



INSERT INTO `annunci`.`utenti` (`id`, `username`, `password`, `nome`, `cognome`, `id_ruolo`, `stato`, `credito_residuo`) VALUES ('1', 'riccardo', 'riccardo', 'Riccardo', 'Carnazza', '1', '1', '90');
INSERT INTO `annunci`.`utenti` (`id`, `username`, `password`, `nome`, `cognome`, `id_ruolo`, `stato`, `credito_residuo`) VALUES ('2', 'andrea', 'andrea', 'Andrea', 'Coluzza', '1', '1', '100');
INSERT INTO `annunci`.`utenti` (`id`, `username`, `password`, `nome`, `cognome`, `id_ruolo`, `stato`, `credito_residuo`) VALUES ('3', 'ruggio', 'ruggio', 'Andrea', 'Di Ruggero', '2', '0', '75');
INSERT INTO `annunci`.`utenti` (`id`, `username`, `password`, `nome`, `cognome`, `id_ruolo`, `stato`, `credito_residuo`) VALUES ('4', 'antonio', 'antonio', 'Antonio', 'Scarpati', '2', '0', '50');
INSERT INTO `annunci`.`utenti` (`id`, `username`, `password`, `nome`, `cognome`, `id_ruolo`, `stato`, `credito_residuo`) VALUES ('5', 'rosario', 'rosario', 'Rosario', 'Di Marco', '2', '1', '125');




INSERT INTO `annunci`.`categorie` (`id`, `descrizione`) VALUES ('1', 'Immobili');
INSERT INTO `annunci`.`categorie` (`id`, `descrizione`) VALUES ('2', 'Automobili');
INSERT INTO `annunci`.`categorie` (`id`, `descrizione`) VALUES ('3', 'Motociclette');
INSERT INTO `annunci`.`categorie` (`id`, `descrizione`) VALUES ('4', 'Elettrodomestici');
INSERT INTO `annunci`.`categorie` (`id`, `descrizione`) VALUES ('5', 'Telefonia');
INSERT INTO `annunci`.`categorie` (`id`, `descrizione`) VALUES ('6', 'Vestiario');


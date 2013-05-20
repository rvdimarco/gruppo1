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



INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('1', 'Vendesi Casa', '500000');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('2', 'Affittasi Stanza Singola mq 20', '700');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('3', 'Ferrari 458 Italia', '250000');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('4', 'Audi R8', '150000');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('5', 'Ducati 1098', '30000');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('6', 'Yamaha R1', '18000');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('7', 'Tostapane', '25');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('8', 'Microonde', '20');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('9', 'iPhone 5', '690');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('10', 'Samsung Galaxy S4', '700');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('11', 'Levi\'s', '50');
INSERT INTO `annunci`.`prodotti` (`id`, `descrizione`, `prezzo`) VALUES ('12', 'Adidas Trainer', '70');





INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('1', 'Vendesi casa in pieno centro a Roma  mq 80 ', '1', '1', '1', '2');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('2', 'Affitasi stanza vicino La Sapienza mq 20', '1', '1', '2', '1');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('3', 'Vendesi Ferrari 458 italia', '0', '2', '1', '3');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('4', 'Vendesi Audi R8', '1', '2', '2', '2');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('5', 'Vendesi Ducati 1098', '0', '3', '1', '4');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('6', 'Vendesi Yamaha R1', '1', '3', '2', '5');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('7', 'Vendesi Tostapane', '0', '4', '1', '5');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('8', 'Vendesi Microonde', '0', '4', '2', '3');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('9', 'Vendesi iPhone', '1', '5', '1', '1');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('10', 'Vendesi S4', '0', '5', '2', '4');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('11', 'Vendesi jeans Levi\'s', '0', '6', '1', '1');
INSERT INTO `annunci`.`annunci` (`id`, `descrizione`, `stato`, `id_categoria`, `id_prodotto`, `owner`) VALUES ('12', 'Vendesi Adidas Trainer', '1', '6', '2', '4');



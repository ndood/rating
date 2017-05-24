CREATE TABLE `group_` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `course` VARCHAR(255) NULL DEFAULT NULL,
  `groupname` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;

CREATE TABLE `subject` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `subject_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;

CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `changed_date` DATETIME NULL DEFAULT NULL,
  `created_date` DATETIME NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `first_name` VARCHAR(255) NULL DEFAULT NULL,
  `last_name` VARCHAR(255) NULL DEFAULT NULL,
  `password` VARCHAR(255) NULL DEFAULT NULL,
  `username` VARCHAR(255) NULL DEFAULT NULL,
  `group_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKoixoutun2ivqkb2kn3mr8k97f` (`group_id`),
  CONSTRAINT `FKoixoutun2ivqkb2kn3mr8k97f` FOREIGN KEY (`group_id`) REFERENCES `group_` (`id`)
)
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;

CREATE TABLE `user_role` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(255) NULL DEFAULT NULL,
  `user_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK859n2jvi8ivhui0rl0esws6o` (`user_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
)
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;

CREATE TABLE `mark` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `mark_prof` FLOAT NULL DEFAULT NULL,
  `mark_subject` FLOAT NULL DEFAULT NULL,
  `semester` BIGINT(20) NULL DEFAULT NULL,
  `subject_id` BIGINT(20) NULL DEFAULT NULL,
  `user_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKt6kc1aolba30ld4m8fqmcrt1q` (`subject_id`),
  INDEX `FKlqq420tc6l50pax8so16fane0` (`user_id`),
  CONSTRAINT `FKlqq420tc6l50pax8so16fane0` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKt6kc1aolba30ld4m8fqmcrt1q` FOREIGN KEY (`subject_id`) REFERENCES `subject` (`id`)
)
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;

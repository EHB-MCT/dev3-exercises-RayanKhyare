/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `cities` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` text CHARACTER SET utf8,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

CREATE TABLE `passengers` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` text CHARACTER SET utf8,
  `ride` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

CREATE TABLE `rides` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `train` int(11) unsigned NOT NULL,
  `departure_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `departure_city` text CHARACTER SET utf8,
  `destination_city` text CHARACTER SET utf8,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

CREATE TABLE `trains` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `type` text CHARACTER SET utf8,
  `max_speed` int(255) unsigned DEFAULT NULL,
  `max_passengers` int(255) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

INSERT INTO `cities` (`id`, `name`) VALUES
(1, 'Brussels');
INSERT INTO `cities` (`id`, `name`) VALUES
(2, 'Ghent');
INSERT INTO `cities` (`id`, `name`) VALUES
(3, 'Brugge');
INSERT INTO `cities` (`id`, `name`) VALUES
(4, 'Antwerp');

INSERT INTO `passengers` (`id`, `name`, `ride`) VALUES
(1, 'Rayan', 1);
INSERT INTO `passengers` (`id`, `name`, `ride`) VALUES
(2, 'Guillaume', 3);
INSERT INTO `passengers` (`id`, `name`, `ride`) VALUES
(3, 'Matthias', 2);
INSERT INTO `passengers` (`id`, `name`, `ride`) VALUES
(4, 'Sam', 1);

INSERT INTO `rides` (`id`, `train`, `departure_time`, `departure_city`, `destination_city`) VALUES
(1, 1, '2021-11-09 09:34:21', '1', '2');
INSERT INTO `rides` (`id`, `train`, `departure_time`, `departure_city`, `destination_city`) VALUES
(2, 3, '2021-11-09 10:12:16', '2', '1');
INSERT INTO `rides` (`id`, `train`, `departure_time`, `departure_city`, `destination_city`) VALUES
(3, 2, '2021-11-09 10:21:42', '1', '3');
INSERT INTO `rides` (`id`, `train`, `departure_time`, `departure_city`, `destination_city`) VALUES
(4, 1, '2021-11-09 10:21:52', '3', '1');

INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(1, 'IC', 200, 200);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(2, 'P', 80, 200);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(3, 'S', 70, 150);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(4, 'L', 100, 200);


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
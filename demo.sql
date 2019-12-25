/*
Navicat MySQL Data Transfer

Source Server         : hjs
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-12-25 15:00:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `u_id` int(10) NOT NULL DEFAULT '0',
  `url` varchar(255) NOT NULL,
  `date` varchar(10) NOT NULL,
  `frequency` int(5) DEFAULT NULL,
  PRIMARY KEY (`u_id`,`url`,`date`),
  CONSTRAINT `uid` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', 'home.firefoxchina.cn', '2019-12-23', '1');
INSERT INTO `record` VALUES ('1', 'www.baidu.com', '2019-12-25', '13');
INSERT INTO `record` VALUES ('2', 'www.baidu.com', '2019-12-25', '2');
INSERT INTO `record` VALUES ('3', 'news.baidu.com/guonei', '2019-12-25', '5');
INSERT INTO `record` VALUES ('3', 'www.baidu.com', '2019-12-23', '2');
INSERT INTO `record` VALUES ('3', 'www.baidu.com', '2019-12-24', '2');
INSERT INTO `record` VALUES ('4', 'news.baidu.com', '2019-12-24', '1');
INSERT INTO `record` VALUES ('4', 'news.baidu.com', '2019-12-25', '5');
INSERT INTO `record` VALUES ('4', 'news.baidu.com/mil', '2019-12-25', '2');
INSERT INTO `record` VALUES ('5', 'home.firefoxchina.cn', '2019-12-25', '5');
INSERT INTO `record` VALUES ('6', 'news.baidu.com/guoji', '2019-12-25', '7');
INSERT INTO `record` VALUES ('6', 'news.baidu.com/mil', '2019-12-24', '10');
INSERT INTO `record` VALUES ('6', 'news.baidu.com/mil', '2019-12-25', '2');
INSERT INTO `record` VALUES ('7', 'news.baidu.com/guonei', '2019-12-24', '4');
INSERT INTO `record` VALUES ('7', 'news.baidu.com/mil', '2019-12-25', '7');
INSERT INTO `record` VALUES ('8', 'news.baidu.com/finance', '2019-12-25', '9');
INSERT INTO `record` VALUES ('9', 'news.baidu.com/sports\r', '2019-12-25', '9');
INSERT INTO `record` VALUES ('10', 'news.baidu.com/internet', '2019-12-25', '11');
INSERT INTO `record` VALUES ('11', 'news.baidu.com/ent', '2019-12-25', '11');
INSERT INTO `record` VALUES ('12', 'news.baidu.com/tech', '2019-12-25', '15');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(10) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(100) NOT NULL,
  `u_password` varchar(100) NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `uName` (`u_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'anonymous', '123');
INSERT INTO `user` VALUES ('2', 'user1', '456');
INSERT INTO `user` VALUES ('3', 'alpha', 'AaBbCc');
INSERT INTO `user` VALUES ('4', 'Me', 'He123456');
INSERT INTO `user` VALUES ('5', 'qwgfvo', 'aliez');
INSERT INTO `user` VALUES ('6', 'fruit', 'appLe');
INSERT INTO `user` VALUES ('7', 'Sherlock', 'Holmes');
INSERT INTO `user` VALUES ('8', '1024', 'programmer');
INSERT INTO `user` VALUES ('9', 'rock', '666');
INSERT INTO `user` VALUES ('10', 'name', 'nan');
INSERT INTO `user` VALUES ('11', 'qimingfei', 'haonan');
INSERT INTO `user` VALUES ('12', 'DF', 'SONY');

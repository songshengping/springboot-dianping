CREATE TABLE `user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nickname` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `create_time` datetime(0) NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_phone_index`(`phone`) USING BTREE
);
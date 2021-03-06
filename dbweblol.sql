-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2017 at 04:54 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbweblol`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
`ID` int(11) NOT NULL,
  `Link` varchar(250) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=210 ;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`ID`, `Link`) VALUES
(1, '3211'),
(2, '1057'),
(3, '2053'),
(4, '3068'),
(5, '1018'),
(6, '1033'),
(7, '3112'),
(8, '2009'),
(9, '2003'),
(10, '2033'),
(11, '3184'),
(12, '3022'),
(13, '3133'),
(14, '3044'),
(15, '3069'),
(16, '1039'),
(17, '1004'),
(18, '2047'),
(19, '3104'),
(20, '3156'),
(21, '3060'),
(22, '3028'),
(23, '3174'),
(24, '3185'),
(25, '1043'),
(26, '3035'),
(27, '1037'),
(28, '3085'),
(29, '3124'),
(30, '1042'),
(31, '3711'),
(32, '3087'),
(33, '3102'),
(34, '3190'),
(35, '3152'),
(36, '3114'),
(37, '3034'),
(38, '2138'),
(39, '2140'),
(40, '2139'),
(41, '3025'),
(42, '1051'),
(43, '1026'),
(44, '3134'),
(45, '1058'),
(46, '3001'),
(47, '3082'),
(48, '3075'),
(49, '3742'),
(50, '1029'),
(51, '1031'),
(52, '3083'),
(53, '3065'),
(54, '3191'),
(55, '3026'),
(56, '3009'),
(57, '3117'),
(58, '3006'),
(59, '3158'),
(60, '3047'),
(61, '3020'),
(62, '1001'),
(63, '3111'),
(64, '3153'),
(65, '3706'),
(66, '3137'),
(67, '3123'),
(68, '3903'),
(69, '3902'),
(70, '3067'),
(71, '3222'),
(72, '1028'),
(73, '2045'),
(74, '3084'),
(75, '3072'),
(76, '1053'),
(77, '3181'),
(78, '3140'),
(79, '3143'),
(80, '3302'),
(81, '1054'),
(82, '1074'),
(83, '3024'),
(84, '3180'),
(85, '3460'),
(86, '1038'),
(87, '3101'),
(88, '1036'),
(89, '1055'),
(90, '1075'),
(91, '3144'),
(92, '3142'),
(93, '3004'),
(94, '3008'),
(95, '3155'),
(96, '3146'),
(97, '1062'),
(98, '3105'),
(99, '1027'),
(100, '3113'),
(101, '3198'),
(102, '3196'),
(103, '3197'),
(104, '3200'),
(105, '3033'),
(106, '3159'),
(107, '3154'),
(108, '3504'),
(109, '3303'),
(110, '1083'),
(111, '3508'),
(112, '3744'),
(113, '3046'),
(114, '2015'),
(115, '2301'),
(116, '2303'),
(117, '3136'),
(118, '3401'),
(119, '3151'),
(120, '2302'),
(121, '2050'),
(122, '2043'),
(123, '3340'),
(124, '3341'),
(125, '3348'),
(126, '3096'),
(127, '3106'),
(128, '3053'),
(129, '3089'),
(130, '3090'),
(131, '3901'),
(132, '3599'),
(133, '3052'),
(134, '3098'),
(135, '3115'),
(136, '3345'),
(137, '1006'),
(138, '3170'),
(139, '1056'),
(140, '1076'),
(141, '1063'),
(142, '3056'),
(143, '3036'),
(144, '3070'),
(145, '3073'),
(146, '3364'),
(147, '1082'),
(148, '1332'),
(149, '1412'),
(150, '1414'),
(151, '1330'),
(152, '1331'),
(153, '1413'),
(154, '1333'),
(155, '3244'),
(156, '1415'),
(157, '3932'),
(158, '2052'),
(159, '2054'),
(160, '3165'),
(161, '3003'),
(162, '3007'),
(163, '3048'),
(164, '3074'),
(165, '3077'),
(166, '3748'),
(167, '3071'),
(168, '3122'),
(169, '1041'),
(170, '3041'),
(171, '1052'),
(172, '3108'),
(173, '3086'),
(174, '3100'),
(175, '3145'),
(176, '3078'),
(177, '3751'),
(178, '3043'),
(179, '3363'),
(180, '3512'),
(181, '2032'),
(182, '2031'),
(183, '3057'),
(184, '3110'),
(185, '2010'),
(186, '3135'),
(187, '3116'),
(188, '3027'),
(189, '3029'),
(190, '2051'),
(191, '3362'),
(192, '3361'),
(193, '3800'),
(194, '3031'),
(195, '3285'),
(196, '3801'),
(197, '3097'),
(198, '3812'),
(199, '3092'),
(200, '3010'),
(201, '2049'),
(202, '3094'),
(203, '1011'),
(204, '3139'),
(205, '3091'),
(206, '3715'),
(207, '3050'),
(208, '3157'),
(209, '3301');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `item`
--
ALTER TABLE `item`
 ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=210;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

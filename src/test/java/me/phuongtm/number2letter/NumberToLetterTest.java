package me.phuongtm.number2letter;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberToLetterTest {

    @Test
    public void testSingleNumberOne() {
        String input = "1";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một", rs);
    }

    @Test
    public void testSingleNumberTwo() {
        String input = "2";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "hai", rs);
    }

    @Test
    public void testSingleNumberThree() {
        String input = "3";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "ba", rs);
    }

    @Test
    public void testSingleNumberFour() {
        String input = "4";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "bốn", rs);
    }

    @Test
    public void testSingleNumberFive() {
        String input = "5";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "năm", rs);
    }

    @Test
    public void testSingleNumberSix() {
        String input = "6";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "sáu", rs);
    }

    @Test
    public void testSingleNumberSeven() {
        String input = "7";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "bảy", rs);
    }

    @Test
    public void testSingleNumberEight() {
        String input = "8";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "tám", rs);
    }

    @Test
    public void testSingleNumberNine() {
        String input = "9";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "chín", rs);
    }

    @Test
    public void testTwoNumberWithZeroLast() {
        String input = "20";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "hai mươi", rs);
    }

    @Test
    public void testTwoNumberWithFourLast() {
        String input = "24";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "hai mươi tư", rs);
    }

    @Test
    public void testTwoNumberWithFiveLast() {
        String input = "25";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "hai mươi lăm", rs);
    }

    @Test
    public void testTwoNumberWithFiveLast15() {
        String input = "15";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười lăm", rs);
    }

    @Test
    public void testTwoNumberWithFiveLast14() {
        String input = "14";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười bốn", rs);
    }

    @Test
    public void testThreeNumber123() {
        String input = "123";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi ba", rs);
    }

    @Test
    public void testThreeNumber120() {
        String input = "120";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi", rs);
    }

    @Test
    public void testThreeNumber124() {
        String input = "124";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi tư", rs);
    }

    @Test
    public void testThreeNumber125() {
        String input = "125";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi lăm", rs);
    }

    @Test
    public void testFourNumber1022() {
        String input = "1022";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một nghìn không trăm hai mươi hai", rs);
    }

    @Test
    public void testFourNumber1025() {
        String input = "1025";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một nghìn không trăm hai mươi lăm", rs);
    }

    @Test
    public void testFourNumber1024() {
        String input = "1024";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một nghìn không trăm hai mươi tư", rs);
    }

    @Test
    public void testFourNumber1004() {
        String input = "1004";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một nghìn không trăm linh bốn", rs);
    }

    @Test
    public void testFourNumber1005() {
        String input = "1005";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một nghìn không trăm linh năm", rs);
    }

    @Test
    public void testFiveNumber12345() {
        String input = "12345";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai nghìn ba trăm bốn mươi lăm", rs);
    }

    @Test
    public void testFiveNumber12305() {
        String input = "12305";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai nghìn ba trăm linh năm", rs);
    }

    @Test
    public void testFiveNumber12304() {
        String input = "12304";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai nghìn ba trăm linh bốn", rs);
    }

    @Test
    public void testFiveNumber12354() {
        String input = "12354";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai nghìn ba trăm năm mươi tư", rs);
    }

    @Test
    public void testFiveNumber12355() {
        String input = "12355";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai nghìn ba trăm năm mươi lăm", rs);
    }

    @Test
    public void testSixNumber123456() {
        String input = "123456";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi ba nghìn bốn trăm năm mươi sáu", rs);
    }

    @Test
    public void testSixNumber123454() {
        String input = "123454";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi ba nghìn bốn trăm năm mươi tư", rs);
    }

    @Test
    public void testSixNumber123455() {
        String input = "123455";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi ba nghìn bốn trăm năm mươi lăm", rs);
    }

    @Test
    public void testSixNumber123404() {
        String input = "123404";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi ba nghìn bốn trăm linh bốn", rs);
    }

    @Test
    public void testSixNumber123405() {
        String input = "123405";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một trăm hai mươi ba nghìn bốn trăm linh năm", rs);
    }

    @Test
    public void testSevenNumber1234567() {
        String input = "1234567";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một triệu hai trăm ba mươi tư nghìn năm trăm sáu mươi bảy", rs);
    }

    @Test
    public void testSevenNumber1234565() {
        String input = "1234565";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một triệu hai trăm ba mươi tư nghìn năm trăm sáu mươi lăm", rs);
    }

    @Test
    public void testSevenNumber1234564() {
        String input = "1234564";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một triệu hai trăm ba mươi tư nghìn năm trăm sáu mươi tư", rs);
    }

    @Test
    public void testSevenNumber1234505() {
        String input = "1234505";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một triệu hai trăm ba mươi tư nghìn năm trăm linh năm", rs);
    }

    @Test
    public void testSevenNumber1234504() {
        String input = "1234504";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "một triệu hai trăm ba mươi tư nghìn năm trăm linh bốn", rs);
    }

    @Test
    public void testEightNumber12345678() {
        String input = "12345678";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai triệu ba trăm bốn mươi lăm nghìn sáu trăm bảy mươi tám", rs);
    }

    @Test
    public void testEightNumber12345675() {
        String input = "12345675";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai triệu ba trăm bốn mươi lăm nghìn sáu trăm bảy mươi lăm", rs);
    }

    @Test
    public void testEightNumber12345674() {
        String input = "12345674";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai triệu ba trăm bốn mươi lăm nghìn sáu trăm bảy mươi tư", rs);
    }

    @Test
    public void testEightNumber12345604() {
        String input = "12345604";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai triệu ba trăm bốn mươi lăm nghìn sáu trăm linh bốn", rs);
    }

    @Test
    public void testEightNumber12345605() {
        String input = "12345605";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("", "mười hai triệu ba trăm bốn mươi lăm nghìn sáu trăm linh năm", rs);
    }

    @Test
    public void testNineNumber123456789() {
        String input = "123456789";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm hai mươi ba triệu bốn trăm năm mươi sáu nghìn bảy trăm tám mươi chín", rs);
    }

    @Test
    public void testNineNumber123456785() {
        String input = "123456785";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm hai mươi ba triệu bốn trăm năm mươi sáu nghìn bảy trăm tám mươi lăm", rs);
    }

    @Test
    public void testNineNumber123456784() {
        String input = "123456784";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm hai mươi ba triệu bốn trăm năm mươi sáu nghìn bảy trăm tám mươi tư", rs);
    }

    @Test
    public void testNineNumber123456704() {
        String input = "123456704";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm hai mươi ba triệu bốn trăm năm mươi sáu nghìn bảy trăm linh bốn", rs);
    }

    @Test
    public void testNineNumber123456705() {
        String input = "123456705";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm hai mươi ba triệu bốn trăm năm mươi sáu nghìn bảy trăm linh năm", rs);
    }

    @Test
    public void testTenNumber1234567891() {
        String input = "1234567891";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một tỷ hai trăm ba mươi tư triệu năm trăm sáu mươi bảy nghìn tám trăm chín mươi mốt", rs);
    }

    @Test
    public void testTenNumber1234567895() {
        String input = "1234567895";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một tỷ hai trăm ba mươi tư triệu năm trăm sáu mươi bảy nghìn tám trăm chín mươi lăm", rs);
    }

    @Test
    public void testTenNumber1234567894() {
        String input = "1234567894";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một tỷ hai trăm ba mươi tư triệu năm trăm sáu mươi bảy nghìn tám trăm chín mươi tư", rs);
    }

    @Test
    public void testElevenNumber11234567894() {
        String input = "11234567894";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "mười một tỷ hai trăm ba mươi tư triệu năm trăm sáu mươi bảy nghìn tám trăm chín mươi tư", rs);
    }

    @Test
    public void testTwelveNumber112234567894() {
        String input = "112234567894";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm mười hai tỷ hai trăm ba mươi tư triệu năm trăm sáu mươi bảy nghìn tám trăm chín mươi tư", rs);
    }

    @Test
    public void test10() {
        String input = "10";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "mười", rs);
    }

    @Test
    public void test100() {
        String input = "100";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm", rs);
    }

    @Test
    public void test1000() {
        String input = "1000";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một nghìn", rs);
    }

    @Test
    public void test10000() {
        String input = "10000";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "mười nghìn", rs);
    }

    @Test
    public void test100000() {
        String input = "100000";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm nghìn", rs);
    }

    @Test
    public void test1000000() {
        String input = "1000000";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một triệu", rs);
    }

    @Test
    public void test100000000() {
        String input = "100000000";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm triệu", rs);
    }

    @Test
    public void test1002() {
        String input = "1002";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một nghìn không trăm linh hai", rs);
    }

    @Test
    public void test900200() {
        String input = "900200";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "chín trăm nghìn hai trăm", rs);
    }

    @Test
    public void test10101() {
        String input = "10101";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "mười nghìn một trăm linh một", rs);
    }

    @Test
    public void test0001() {
        String input = "0001";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một", rs);
    }

    @Test
    public void test5555() {
        String input = "5555";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "năm nghìn năm trăm năm mươi lăm", rs);
    }

    @Test
    public void test8888() {
        String input = "8888";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "tám nghìn tám trăm tám mươi tám", rs);
    }

    @Test
    public void test134() {
        String input = "134";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm ba mươi tư", rs);
    }

    @Test
    public void test135() {
        String input = "135";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một trăm ba mươi lăm", rs);
    }

    @Test
    public void test5123123154() {
        String input = "5123123154";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "năm tỷ một trăm hai mươi ba triệu một trăm hai mươi ba nghìn một trăm năm mươi tư", rs);
    }

    @Test
    public void test1010() {
        String input = "1010";
        String rs = NumberToLetter.from(input);
        Assert.assertEquals("",
                "một nghìn không trăm mười", rs);
    }

    private String format(String input) {
        return Arrays.asList(input.split("(?<=\\G...)"))
                .stream()
                .map(i -> i.toString())
                .collect(Collectors.joining("_"));
    }
}

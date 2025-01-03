class Solution {
  String multiply(String num1, String num2) {
    BigInt a=BigInt.parse(num1);
    BigInt b=BigInt.parse(num2);

    BigInt res=a*b;
    return res.toString();
  }
}
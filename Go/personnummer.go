func main() {
  n1 := 8 * 2;
  n2 := 1 * 1;
  n3 := 1 * 2;
  n4 := 2 * 1;
  n5 := 1 * 2;
  n6 := 8 * 1;
  n7 := 9 * 2;
  n8 := 8 * 1;
  n9 := 7 * 2;

  sum := digitSum(n1) + digitSum(n2) + digitSum(n3) + digitSum(n4) + digitSum(n5);
  sum = sum + digitSum(n6) + digitSum(n7) + digitSum(n8) + digitSum(n9);

  controlDigit := sum % 10;
  controlDigit = 10 - controlDigit;

  valid := controlDigit + sum;
  valid = valid % 10;

  print(sum);
  print(controlDigit);
  print(valid == 0);
}

func digitSum(n int) int {
  if n > 10 {
    return n % 10 + 1;
  }
  return n;
}

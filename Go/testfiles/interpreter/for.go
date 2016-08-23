func main() {
  for i := 1; i < 3; i = i + 1 {
    print(i);
  }

  var i2 int = 1;
  for ; i2 < 3; i2 = i2 + 1 {
    print(10 + i2);
  }

  var i3 int = 1;
  for ; i3 < 5; {
      i3 = i3 + 1;
      print(20 + i3);
  }

  var i4 int = 1;
  for ;i4 < 3; i4 = i4 + 1 {
    print(30 + i4);
  }

  for i4 > 0 {
    i4 = i4 - 1;
    print(40 + i4);
  }
}

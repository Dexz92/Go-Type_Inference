func main() {
  for i := 1; i < 3; i = i + 1 {
    res := 0;
    for j := 0; j < 3; j = j + 1 {
      print(i);
      res = res + j + i;
    }
    print(res);
  }

  if a := 1; a != 1 {
    print(0);
  } else {
    if a == 1 {
      for i := 1; i < 3; i = i + 1 {
        print(10);
        if i == 1 {
          for j := 0; j < 3; j = j + 1 {
            print(11);
          }
        } else {
          print(1);
        }
      }
    }
  }
}

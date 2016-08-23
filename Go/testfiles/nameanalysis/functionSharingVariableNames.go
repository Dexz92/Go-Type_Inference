func main() {
  a := 1;
  b();
}

func b()  {
  a();
}

func a()  {
  var b = 5;
}

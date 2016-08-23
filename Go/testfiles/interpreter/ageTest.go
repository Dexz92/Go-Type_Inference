var magicModifier = 2;
var magicLimit = 10;

func main() {
  age1 := 20;
  age2 := 20;
  age3 := 40;

  ageResult := sum3(age1, age2, age3);

  for i := 0; i < 3; i = i + 1 {
    ageResult = ageResult / magicModifier;
  }

  if ageResult > magicLimit {
    ageResult = ageResult * magicModifier;
  } else {
    ageResult = ageResult + magicModifier;
  }

  magicCondition := ageResult > magicLimit + 5;

  print(ageResult);
  print(magicCondition);
}

func sum3(a int, b int, c int) int {
  return a + b + c;
}

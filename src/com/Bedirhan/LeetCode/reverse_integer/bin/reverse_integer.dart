import 'dart:math';

void main(List<String> args) {
  int x = 1534236469;
  print(reverse(x));
}

int reverse(int x) {
  num constraint = pow(2, 31);
  if (x == 0 || !(x <= constraint - 1) || !(x > -constraint)) return 0;
  List<double> reverse_order = [];
  String sign = x > 0 ? "+" : "-";
  double double_x = x.toDouble().abs();
  double result1 = remove_zeros(double_x);

  while (result1.toInt() > 0) {
    if (result1 % 10 != 0) {
      reverse_order.add(result1 % 10);
    } else {
      reverse_order.add(0);
    }
    result1 = result1 / 10;
  }
  String result = "";
  for (var element in reverse_order) {
    int temp = element.toInt();
    result += temp.toString();
  }

  if (sign == "-") {
    sign += result;
    return int.parse(sign);
  } else
    return int.parse(result);
}

double remove_zeros(double x) {
  double temp = x;
  int r = 0;
  while (true) {
    if (temp % 10 == 0) {
      r++;
      temp = temp / 10;
    } else {
      break;
    }
  }
  for (var i = 0; i < r; i++) {
    x = x / 10;
  }
  return x;
}

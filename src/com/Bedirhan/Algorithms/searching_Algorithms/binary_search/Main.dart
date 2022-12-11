void main(List<String> args) {
  BinarySearch binarySearch = BinarySearch();
  List<int> list = [1, 5, 8, 7, 11, 23, 35, 76, 99, 122, 123, 546, 1234, 12345];
  if (binarySearch.find_with_binary_search(list, 4, 0, list.length - 1)) {
    print("Yeah");
  } else {
    print("Nooo");
  }
}

class BinarySearch {
  bool find_with_binary_search(List<int> list, int target, int low, int high) {
    if (low > high) {
      return false;
    } else {
      num mid = (low + high) / 2;
      if (target == list.elementAt(int.parse(mid.toString())))
        return true;
      else if (target > list.elementAt(int.parse(mid.toString()))) {
        return find_with_binary_search(
            list, target, int.parse((mid + 1).toString()), high);
      } else {
        return find_with_binary_search(
            list, target, low, int.parse((mid - 1).toString()));
      }
    }
  }
}

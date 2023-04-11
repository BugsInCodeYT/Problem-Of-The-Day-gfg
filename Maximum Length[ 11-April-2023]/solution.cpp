//  >> C++ CODE <<

int max_length(int a, int b, int c) {
    int max_val = max(a, max(b, c));
    int y;
    if (max_val == a) {
        y = b + c;
    } else if (max_val == b) {
        y = c + a;
    } else {
        y = a + b;
    }
    if (2 * (y + 1) >= max_val) {
        return a + b + c;
    }
    return -1;
}
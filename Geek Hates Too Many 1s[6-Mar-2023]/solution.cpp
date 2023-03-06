
class Solution {

  public:
    int noConseBits(int n) {
    int bits[32];

    //storing number
    for (int i = 0; i < 32; i++) {
        int bit = ((1 << i) & n) > 0 ? 1 : 0;
        bits[31 - i] = bit;
    }

    //main logic
    int i = 0, j = 0;
    int sum = 0;

    while (j < 32) {
        if (j < 2) {
            sum += bits[j];
            j++;
        } else {
            sum += bits[j];

            if (sum == 3) {
                sum -= bits[j];
                bits[j] = 0;
            }

            sum -= bits[i];
            j++; i++;
        }
    }

    //convert to decimal
    int num = 0;

    for (i = 31; i >= 0; i--) {
        if (bits[i] == 1) {
            num += pow(2, 31 - i);
        }
    }

    return num;
}

};

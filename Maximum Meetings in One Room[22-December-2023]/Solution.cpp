//         >> CPP CODE <<

class Pair {
public:
    int st, end, index;

    Pair(int st, int end, int index) : st(st), end(end), index(index) {}
};

class Solution {
public:
    vector<int> maxMeetings(int N, vector<int>& S, vector<int>& F) {
        vector<Pair> meetings;

        for (int i = 0; i < N; i++) {
            meetings.push_back(Pair(S[i], F[i], i + 1));
        }

        sort(meetings.begin(), meetings.end(), [](const Pair& a, const Pair& b) {
            return a.end < b.end;
        });

        vector<int> ans;
        Pair* prev = nullptr;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                ans.push_back(meetings[i].index);
                prev = &meetings[i];
            } else {
                if (meetings[i].st > prev->end) {
                    ans.push_back(meetings[i].index);
                    prev = &meetings[i];
                }
            }
        }

        sort(ans.begin(), ans.end());

        return ans;
    }
};
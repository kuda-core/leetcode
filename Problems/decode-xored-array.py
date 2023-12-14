class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        ret = (len(encoded) + 1)*[0]
        for i in range(len(encoded)):
            #encoded[i] = arr[i] XOR arr[i + 1]
            ret[i] = first
            first = (encoded[i]) ^ first
        ret[len(encoded)] = first
        return ret

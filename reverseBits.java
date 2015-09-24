public int reverseBits(int n) {
	int tmp = 0;
	int res = 0;
	for (int i=0;i<32;i++){
		tmp = n & 1;
		n = n>>1;
		res = (res<<1) + tmp;

	}
	return res;
}
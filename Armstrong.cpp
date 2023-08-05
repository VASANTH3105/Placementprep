bool checkArmstrong(int n){
	//Write your code here
	int originalNumber = n;
	int count = 0;
	int temp = n;
	while(temp!=0) {
		count++;
		temp/=10;
	}
	int nums = n;
	int res=0;
	while(nums!=0){
		int digit = nums % 10;
		res += pow(digit,count);
		nums/=10;
	}
	if(res == originalNumber)
		return true;
	else
		return false;
}

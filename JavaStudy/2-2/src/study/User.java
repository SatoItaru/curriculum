package study;

	
	class User{
		
		private String userName ;
		
		private int id ;
		
		private String password;
		
		public User () {
			
			this.userName = "hoge";
			
			this.id = 123;
			
			this.password = "abc123";
		}

	protected void printAccountInfo() {
		
		System.out.println("ユーザー名は、" + this.userName + "IDは、" + this.id + "パスワードは、" + this.password);
		
	}
}
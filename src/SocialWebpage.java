public interface SocialWebpage {
    public void Register (String FirstName,String LastName,int NumberPhone,boolean Gender);
    public boolean Login(int NumberPhone,String Gmail);
    public boolean SearchField(String Username);
    public String[] PictureList();
    public void connect (String PictureList,String FriendList);
}

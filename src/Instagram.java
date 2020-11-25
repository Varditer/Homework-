public class Instagram extends website implements SocialWebpage{
    @Override
    public void Register(String FirstName, String LastName, int NumberPhone, boolean Gender) {

    }

    @Override
    public boolean Login(int NumberPhone, String Gmail) {
        return false;
    }

    @Override
    public boolean SearchField(String Username) {
        return false;
    }

    @Override
    public String[] PictureList() {
        return new String[0];
    }

    @Override
    public void connect(String PictureList, String FriendList) {

    }
}

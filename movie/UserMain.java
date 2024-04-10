package movie;

public class UserMain {
    public static void main(String[] args) {
        Address address=new Address();
        address.street="GandhiBomma";
        address.area="Chandragudem";
        address.houseNo="3_24";
        address.pinCode="521230";
        User user =new User();
        user.name="siva";

        user.email="gsivakrishna007@gmail.com";
        user.mobileNo="7981387989";
        user.address=address;
        System.out.println(user.email);
        System.out.println(user.mobileNo);
        System.out.println(user.name);
        System.out.println(user.address.area);
        System.out.println(user.address.houseNo);
        System.out.println(user.address.pinCode);
        System.out.println(user.address.street);
        Address address1= new Address();
        address1.street="VijayawadaRoad";
        address1.pinCode="521230";
        address1.houseNo="5-178";
        address1.area="";

        Restaurant restaurant =new Restaurant();
        restaurant.name="VSR FamilyRestaurent";
        restaurant.address=address1;
        System.out.println(restaurant.name);
        System.out.println(restaurant.address.street);
        System.out.println(restaurant.address.pinCode);
        System.out.println(restaurant.address.houseNo);
        System.out.println(restaurant.address.area);

    }
}

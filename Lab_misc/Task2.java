public class Task2 {

    

    public static void main(String[] args) {
        
            Playlist  playlist  = new Playlist();

            Playlist.SongNode  song1 = new Playlist().new SongNode("Ignite","Alan walker","4.33");
            Playlist.SongNode  song2 = new Playlist().new SongNode("Cheque","Shubh","5.33");
            Playlist.SongNode  song3 = new Playlist().new SongNode("Kashni","Jasmine Sandlas","3.13");
            Playlist.SongNode  song4 = new Playlist().new SongNode("Not Afraid","Eminem","6.43");

            playlist.insert(song1);
            System.out.println("Song 1 ");
            playlist.insert(song2);
              System.out.println("Song 2 ");
            playlist.insert(song3);
              System.out.println("Song 3 ");
                  playlist.insert(song4);
                    System.out.println("Song 4 ");
                 playlist.display();
         playlist.delete("Cheque");
    }
}


class Playlist{


    class SongNode{

        private String  title ;
        private  String artist;
        private  String durations;
        private SongNode nextSong ;
            public SongNode()
            {

            }

            public  SongNode(String title , String artist,  String durations)
            {
                this.title =  title;
                this.artist =  artist;
                this.durations =  durations;
                this.nextSong = null;
            }
    }

        private SongNode head ;


        void insert(SongNode newSong)
        {
            SongNode song =  new SongNode(newSong.title,newSong.artist,newSong.durations);
            if (head == null) {
                System.out.println("Head called");
                head = song ;     
                return ;
            }
            else
        { 
                    song.nextSong =  head ;      
                head =song;

            } 
       
    }

     void display()
     {

            if (head==null) {
                System.out.println("List is empty ");
                return;
                
            }
                SongNode  temp =  head;
            
                int count = 1;
                while (temp!= null) {

                        System.out.println("Title : "+temp.title);
                        System.out.println("Artist : "+temp.artist);
                        System.out.println("Durations : "+ temp.durations);
                        temp =  temp.nextSong;
                       
                    }
     }

     void delete(String title)
     {
                SongNode  temp =  head;
                SongNode slow =  null;
            
                





}




class Solution {
    public boolean checkStraightLine(int[][] coordinates) {


        int n=coordinates.length;


        int d_y=coordinates[1][1]-coordinates[0][1];
        int d_x=coordinates[1][0]-coordinates[0][0];


        /*
          slope=d_y/d_x;

        */



        for (int i=2 ; i < n ; i++){
              
              int d_y_i=coordinates[i][1]-coordinates[0][1];
              int d_x_i=coordinates[i][0]-coordinates[0][0];


              /*


              slope=d_y_i/d_x_i;


              slope=d_y_i/d_x_i=d_y/d_x;

                  d_y_i*d_x==d_y*d_x_i;

              */
               if (d_y_i*d_x != d_y * d_x_i){

                return false;
               }
            }
            
             return true;

     }



        
    
}
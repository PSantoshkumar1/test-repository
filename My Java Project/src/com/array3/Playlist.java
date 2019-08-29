package com.array3;

public class Playlist {
	

	public static void listening(Songs[] playlist) {
		for(int i=0;i<playlist.length;i++)
		{
		System.out.println(playlist[i].tittle);
		System.out.println(playlist[i].duration);
		System.out.println(playlist[i].singer);
		System.out.println("****************");
		}
	}

	public static void main(String[] args) {
		Songs[]playlist=new Songs[7];
		playlist[0]=new Songs("Teri-Meri",4.00,"ajay");
		playlist[1]=new Songs("Dhoom",4.00,"basheer");
		playlist[2]=new Songs("tagaru",4.00,"prasanna");
		playlist[3]=new Songs("Ena sona",4.00,"anikeeth");
		playlist[4]=new Songs("aashqi",4.00,"girish");
		playlist[5]=new Songs("tumhi ho",4.00,"raghu");
		playlist[6]=new Songs("sun raha hi",4.00,"suraj");
		listening(playlist);
		//[7]=new Songs("nanaku",4.00,"Santosh");
		//System.out.println(playlist[0].tittle + playlist[0].duration+ playlist[0].singer);
		//System.out.println(playlist[1].tittle + playlist[1].duration+ playlist[1].singer);
		//System.out.println(playlist[2].tittle + playlist[2].duration+ playlist[2].singer);
		//System.out.println(playlist[3].tittle + playlist[3].duration+ playlist[3].singer);
		//System.out.println(playlist[4].tittle + playlist[4].duration+ playlist[4].singer);


	
	}
}

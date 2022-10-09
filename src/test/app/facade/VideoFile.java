package test.app.facade;

public class VideoFile {
	
	String name ;
	String codec;
	
	VideoFile( String name ){
		this.name = name;
		this.codec = name.substring(name.lastIndexOf(".")+1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}

}

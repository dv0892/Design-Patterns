package test.app.facade;

public class VideoConversionFacade {

	public void convertVideo( String fileName , String format ) {
		System.out.println( " VideoConversionFacade : conversion started ");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		Codec destCodec ;
		if( format.equals("mp4") ) {
			destCodec = new MPEG4CompressionCodec();
		} else {
			destCodec =  new OggCompressionCodec();
		}
		
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile result = BitrateReader.write(buffer, destCodec);
		
		System.out.println( " VideoConversionFacade : conversion ended ");
	}
}

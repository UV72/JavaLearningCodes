package interfacesPackage;

public interface VideoEditor {
	default void editVideo() {
		System.out.println("The edittor is editting a video");
	}
}

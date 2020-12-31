package org.reactnative.camera.tasks;

import com.facebook.react.bridge.WritableArray;
import org.reactnative.imagelabeler.RNImageLabeler;

public interface ImageLabelerAsyncTaskDelegate {

    void onLabelsDetected(WritableArray labels, int width, int height, byte[] imageData);

    void onImageLabelingError(RNImageLabeler imageLabeler);

    void onImageLabelingTaskCompleted();
}

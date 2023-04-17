package ua.lviv.iot.algo.part1.lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CameraWriter {

    private final String filePath;
    public CameraWriter(){
        filePath = "";
    }

    public CameraWriter(String filePath) {
        this.filePath = filePath;
    }


    public void writeCamerasToFile(List<Camera> cameraList) throws IOException {
        if(cameraList == null || cameraList.isEmpty()) {
            return;
        }
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        boolean hasDigitalCameraHeader = false;
        boolean hasFilmCameraHeader = false;
        boolean hasSpeedCameraHeader = false;
        boolean hasHybridCameraHeader = false;

        for (Camera camera : cameraList) {
            if (camera instanceof DigitalCamera) {
                if (!hasDigitalCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasDigitalCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            } else if (camera instanceof FilmCamera) {
                if (!hasFilmCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasFilmCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            } else if (camera instanceof SpeedCamera) {
                if (!hasSpeedCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasSpeedCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            } else if (camera instanceof HybridCamera) {
                if (!hasHybridCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasHybridCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            }
        }

        bufferedWriter.close();
        fileWriter.close();
    }
}
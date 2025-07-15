package in.bushansirgur.authify.service;

import in.bushansirgur.authify.io.ProfileRequest;
import in.bushansirgur.authify.io.ProfileResponse;

public interface ProfileService {


    ProfileResponse createProfile(ProfileRequest request);
    ProfileResponse getProfile(String email);
}

package com.niit.dao;

import com.niit.models.ProfilePicture;

public interface ProfilePictureDAO {
	void uploadProfilePicture(ProfilePicture profilePicture);
	ProfilePicture getProfilePicture(String email);
}

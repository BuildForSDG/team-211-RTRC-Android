package com.andela.buildsdgs.rtrc.services;

import com.andela.buildsdgs.rtrc.models.User;
import com.andela.buildsdgs.rtrc.models.UserDetail;

import retrofit2.Call;

public interface RTRCService {
    Call<UserDetail> loginUser(User user);
}

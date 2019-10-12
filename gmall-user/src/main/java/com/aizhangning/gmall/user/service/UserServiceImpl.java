package com.aizhangning.gmall.user.service;

import com.aizhangning.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.aizhangning.gmall.user.mapper.UserMapper;
import entity.UmsMember;
import entity.UmsMemberReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper addressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress adress = new UmsMemberReceiveAddress();
        adress.setMemberId(memberId);
        return addressMapper.select(adress);
    }
}

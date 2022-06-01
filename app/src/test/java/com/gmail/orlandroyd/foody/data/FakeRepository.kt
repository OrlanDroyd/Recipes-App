package com.gmail.orlandroyd.foody.data

import com.gmail.orlandroyd.foody.data.local.FakeLocalDataSource
import com.gmail.orlandroyd.foody.data.remote.FakeRemoteDataSource

class FakeRepository(
    remoteDataSource: FakeRemoteDataSource,
    localDataSource: FakeLocalDataSource,
) {
    val remote = remoteDataSource
    val local = localDataSource
}
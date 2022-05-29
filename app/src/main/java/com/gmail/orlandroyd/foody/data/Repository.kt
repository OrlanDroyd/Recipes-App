package com.gmail.orlandroyd.foody.data

import com.gmail.orlandroyd.foody.data.local.LocalDataSource
import com.gmail.orlandroyd.foody.data.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {
    val remote = remoteDataSource
    val local = localDataSource
}
/*
 * Copyright (c) 2016 Qiscus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qiscus.sdk.chat.domain.repository

import com.qiscus.sdk.chat.domain.model.Room
import com.qiscus.sdk.chat.domain.model.Participant
import io.reactivex.Completable
import io.reactivex.Single

/**
 * Created on : September 01, 2017
 * Author     : zetbaitsu
 * Name       : Zetra
 * GitHub     : https://github.com/zetbaitsu
 */
interface RoomRepository {
    fun getRoom(roomId: String): Single<Room>

    fun getRoomWithUserId(userId: String): Single<Room>

    fun createGroupRoom(userIds: List<String>, roomName: String, roomAvatarUrl: String): Single<Room>

    fun getRoomWithChannelId(channelId: String, roomAvatarUrl: String): Single<Room>

    fun getRoomParticipants(roomId: String): Single<List<Participant>>

    fun getRooms(page: Int, limit: Int): Single<List<Room>>

    fun getRoomsWithSpecificIds(roomIds: List<String>, channelIds: List<String>): Single<List<Room>>

    fun clearData(): Completable


}